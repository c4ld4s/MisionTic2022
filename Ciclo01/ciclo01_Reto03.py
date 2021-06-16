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
    for i in pekkedex:
        if longitudCarlos == pekkedex and longitudValeria == pekkedex:
            puntosCarlos = puntosCarlos+1
            puntosValeria = puntosValeria+1
            print('P')
        if longitudCarlos== pekkedex and longitudValeria != pekkedex:
            puntosCarlos = puntosCarlos+1
            print('C')
        if longitudCarlos != pekkedex and longitudValeria == pekkedex:
            puntosValeria = puntosValeria+1
            print('V')
        if longitudCarlos != pekkedex and longitudValeria != pekkedex:
            print('N')


print(juegoPekkemon('AYS','LQK','YSGLZQUQSKRQSBVLVJGQ'))