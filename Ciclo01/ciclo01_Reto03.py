LetrasCarlos:str
LetrasValeria:str
Pekkemons:str

def juegoPekkemon (LetrasCarlos:str, LetrasValeria:str, Pekkemons:str):
    print(LetrasCarlos)
    print(LetrasValeria)
    print(Pekkemons)
    for i in Pekkemons:
        puntosCarlos = 0
        puntosValeria = 0
        lista = []
        if i in LetrasCarlos and i in LetrasValeria:
            puntosCarlos = puntosCarlos+1
            puntosValeria = puntosValeria+1
            lista.append(['P'])
            print(list)
        elif i not in LetrasCarlos and i in LetrasValeria:
            puntosValeria = puntosValeria+1
            lista.append(['V'])
            print(list)
        elif i  in LetrasCarlos and i not in LetrasValeria:
            puntosValeria = puntosValeria+1
            lista.append(['V'])
            print(list)         
        else:
            print("error")

print(juegoPekkemon('AYS','LQK','YSGLZQUQSKRQSBVLVJGQ'))