nombre, tipoContrato, cargo  = str, str, int
#este es el diccionario que se usa para sacar los valores de la cuota del sindicato
Valores_sindicatos = {
    'sindicato0': 0,
    'sindicato1': 13550,
    'sindicato2': 18700,
}

#“””ValoresSindicales funcion que me devuelve la o las cuotas del sindicato que debo pagar, esta funcion se llamara dentro de la funcion calcularSalario y retornara una lista con los valores de las cuotas sindicales a pagar””” 
def ValoresSindicales (llave, valor, datos=Valores_sindicatos):
    if # si el valor del sindicato es true
         #retorneme datos[llave]
    return
    #retorna 0
    pass

#“””Calcular salario
def calcularSalario (empleados):
    saldoBase = 908526
    #definir ciclo para recorrer los empleados
    for 
        #definir variables
        #sacar del diccionario el nombre, tipo de contrato y el cargo
        list(map(ValoresSindicales,diccionario['sindicatos'].keys(),diccionario['sindicatos'].values()))
        #retorna [0,13500,0]
        sum(lista)
        #preguntar por el cargo 
        else :
        print("dato ingresado no valido")


        #calculo salario base
        #print
    pass

empleados = [
    {
        'nombre' : "Juan David",
        'tipoContrato' : 'TERMINOFIJO',
        'cargo' : 3,
        'sindicatos' : {
            'sindicato0' : False,
            'sindicato1' : True,
            'sindicato2' : False
        }
    },
    {
        'nombre' : "Carlos Perez",
        'tipoContrato' : 'APRENDIZAJE',
        'cargo' : 1,
        'sindicatos' : {
            'sindicato0' : False,
            'sindicato1' : False,
            'sindicato2' : False
        }
    },
    {
        'nombre' : "Pedro Lopez",
        'tipoContrato' : 'TERMINOINDEFINIDO',
        'cargo' : 3,
        'sindicatos' : {
            'sindicato0' : False,
            'sindicato1' : True,
            'sindicato2' : True
        }
    }
]

calcularSalario(empleados)