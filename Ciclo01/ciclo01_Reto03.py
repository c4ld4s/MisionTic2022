LetrasCarlos:str
LetrasValeria:str
Pekkemons:str

def juegoPekkemon (LetrasCarlos:str, LetrasValeria:str, Pekkemons:str):
    print(LetrasCarlos)
    print(LetrasValeria)
    print(Pekkemons)
    lista = []
    puntosCarlos = 0
    puntosValeria = 0
    for i in Pekkemons:
        if i in LetrasCarlos and i in LetrasValeria:
            puntosCarlos = puntosCarlos + 1
            puntosValeria = puntosValeria + 1
            lista.append('P')
            print(lista)
            print(str(puntosValeria) + "valeria")
            print(str(puntosCarlos) + "carlos")
            continue
        elif i not in LetrasCarlos and i in LetrasValeria:
            puntosValeria = puntosValeria + 1
            lista.append('V')
            print(lista)
            print(str(puntosValeria) + "valeria")
            print(str(puntosCarlos) + "carlos")
            continue
        elif i in LetrasCarlos and i not in LetrasValeria:
            puntosCarlos = puntosCarlos + 1
            lista.append('C')
            print(lista)
            print(str(puntosValeria) + "valeria")
            print(str(puntosCarlos) + "carlos")
            continue
        elif i not in LetrasCarlos and i not in LetrasValeria:
            puntosValeria = puntosValeria + 1
            lista.append('P')
            print(lista)
            print(str(puntosValeria) + "valeria")
            print(str(puntosCarlos) + "carlos")
            continue

print(juegoPekkemon('AYS','LQK','YSGLZQUQSKRQSBVLVJGQ'))