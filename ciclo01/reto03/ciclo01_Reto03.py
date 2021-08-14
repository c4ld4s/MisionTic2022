#OBJETIVO = Definir una función que consiste en quien adivina la primera letra del nombre de los pekkémons que vienen en el camino.

LetrasCarlos:str
LetrasValeria:str
Pekkemons:str

def juegoPekkemon (LetrasCarlos:str, LetrasValeria:str, Pekkemons:str):
    LetrasCarlos = list(LetrasCarlos)
    LetrasValeria = list(LetrasValeria)
    Pekkemons = list(Pekkemons)
    pekkedex = []
    puntosCarlos = 0
    puntosValeria = 0
    for i in Pekkemons:
        if i in LetrasCarlos and i in LetrasValeria:
            puntosCarlos = puntosCarlos + 1
            puntosValeria = puntosValeria + 1
        if i in LetrasCarlos and not i in LetrasValeria:
            puntosCarlos = puntosCarlos + 1
        if i in LetrasValeria and not i in LetrasCarlos:
            puntosValeria = puntosValeria + 1
        if puntosCarlos == puntosValeria:
            pekkedex.append('P')
        elif puntosCarlos > puntosValeria:
            pekkedex.append('C')
        else :
            pekkedex.append('V')
    return(pekkedex)

print(juegoPekkemon('AYS','LQK','YSGLZQUQSKRQSBVLVJGQ'))