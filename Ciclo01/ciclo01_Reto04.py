#este es el diccionario que se usa para sacar los valores de la cuota del sindicato
Valores_sindicatos = {
    'sindicato0': 0,
    'sindicato1': 13550,
    'sindicato2': 18700,
}

#“””ValoresSindicales funcion que me devuelve la o las cuotas del sindicato que debo pagar, esta funcion se llamara dentro de la funcion calcularSalario y retornara una lista con los valores de las cuotas sindicales a pagar””” 
def ValoresSindicales (llave, valor, datos=Valores_sindicatos):
    return

#“””Calcular salario
def calcularSalario (empleados):
    return

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
        'nombre' : "Juan David",
        'tipoContrato' : 'TERMINOFIJO',
        'cargo' : 3,
        'sindicatos' : {
            'sindicato0' : False,
            'sindicato1' : True,
            'sindicato2' : False
        }
    }
]

calcularSalario(empleados)