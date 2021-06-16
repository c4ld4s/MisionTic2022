LetrasCarlos:str
LetrasValeria:str
Pekkemons:str

def juegoPekkemon (LetrasCarlos:str, LetrasValeria:str, Pekkemons:str):
    longitudCarlos = (int(len(Pekkemons)/len(LetrasCarlos))*LetrasCarlos)+LetrasCarlos[0:2]
    longitudValeria = (int(len(Pekkemons)/len(LetrasValeria))*LetrasValeria)+LetrasValeria[0:2]
    print(list(longitudCarlos))
    print(list(longitudValeria))
    pekkedex = list(Pekkemons)
    print(pekkedex)        
    for i in range(0,len(pekkedex)):
        puntosCarlos = 0
        puntosValeria = 0
        lista = []
        if longitudCarlos == pekkedex and longitudValeria == pekkedex:
            puntosCarlos = puntosCarlos+1
            puntosValeria = puntosValeria+1
            print('P')
            i = i+1
            return lista.append(['P'])
        if longitudCarlos== pekkedex and longitudValeria!= pekkedex:
            puntosCarlos = puntosCarlos+1
            i = i+1
            print('C')
            return lista.append(['C'])
        if longitudCarlos != pekkedex and longitudValeria == pekkedex:
            puntosValeria = puntosValeria+1
            print('V')
            i = i+1
            return lista.append(['V'])
        if longitudCarlos != pekkedex and longitudValeria != pekkedex:
            print('N')
            i = i+1
            return lista.append(['N'])

print(juegoPekkemon('AYS','LQK','YSGLZQUQSKRQSBVLVJGQ'))