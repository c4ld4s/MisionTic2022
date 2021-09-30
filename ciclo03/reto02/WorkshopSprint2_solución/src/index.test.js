require('jest-fetch-mock').enableMocks()
import { fireEvent, getByText } from '@testing-library/dom'
import '@testing-library/jest-dom/extend-expect'
import { JSDOM } from 'jsdom'
import fs from 'fs'
import path from 'path'

const html = fs.readFileSync(path.resolve(__dirname, './index.html'), 'utf8');

let dom
let container

describe('index.html', () => {
  beforeEach(() => {
    // Constructing a new JSDOM with this option is the key
    // to getting the code in the script tag to execute.
    // This is indeed dangerous and should only be done with trusted content.
    // https://github.com/jsdom/jsdom#executing-scripts
    dom = new JSDOM(html, { runScripts: 'dangerously' })
    container = dom.window.document.body
    fetchMock.doMock()
    fetch.resetMocks()
  })

  it('renders h3 element by 3', () => {
    expect(container.querySelectorAll('h3').length).toBe(3)
  })

  it('check the styles tag', () => {
    expect(container.querySelector('style')).toBeNull()
  })
  it('check the services id', () => {
    expect(container.querySelector('#servicio2')).not.toBeNull()
  })
  it('service 1 title', () => {
    expect(container.querySelectorAll('h3')[0].textContent).toBe("")
  })
  it('service 2 title', () => {
    expect(container.querySelectorAll('h3')[1].textContent).toBe("")
  })
  it('service 3 title', () => {
    expect(container.querySelectorAll('h3')[2].textContent).toBe("")
  })
  it('service 1 p', () => {
    expect(container.querySelectorAll('p')[0].textContent).toBe("")
  })
  it('service 2 p', () => {
    expect(container.querySelectorAll('p')[1].textContent).toBe("")
  })
  it('service 3 p', () => {
    expect(container.querySelectorAll('p')[2].textContent).toBe("")
  })
  it('service 1 img', () => {
    expect(container.querySelectorAll('img')[2].src).toBe("")
  })
  it('service 2 img', () => {
    expect(container.querySelectorAll('img')[3].src).toBe("")
  })
  it('service 3 img', () => {
    expect(container.querySelectorAll('img')[4].src).toBe("")
  })
  it('checking the row', () => {
    expect(container.querySelector('#envoltorioServicios').classList.contains('row')).toBeTruthy()
  })

  it('res 200', async () => {
    const data = await fetch('./data.json', { method: 'GET' });
    expect(data.statusText).toBe('OK');
  });
})