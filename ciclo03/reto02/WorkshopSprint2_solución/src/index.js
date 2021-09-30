async function consultarApi() {

    let urlApiLocal = './data.json'
    try {
        let responseText = await fetch(urlApiLocal, { method: 'get' });
        // console.log(responseText);
        let responseJson = await responseText.json();
        // console.log(responseJson);
        pintarInfo(responseJson);
        return responseJson.servicios;
    } catch (error) {
        console.log(error)
    }
}
consultarApi();

const pintarInfo = info => {
    servicio1 = document.getElementById('servicio1');
    servicio2 = document.getElementById('servicio2');
    servicio3 = document.getElementById('servicio3');

    servicio1.children[0].src = info.servicios[0].imagen;
    servicio1.children[1].innerText = info.servicios[0].titulo;
    servicio1.children[2].innerText = info.servicios[0].descripcion;

    servicio2.children[0].src = info.servicios[1].imagen;
    servicio2.children[1].innerText = info.servicios[1].titulo;
    servicio2.children[2].innerText = info.servicios[1].descripcion;

    servicio3.children[0].src = info.servicios[2].imagen;
    servicio3.children[1].innerText = info.servicios[2].titulo;
    servicio3.children[2].innerText = info.servicios[2].descripcion;

}