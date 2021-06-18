nombre, tipoContrato, cargo, empleados  = str, str, int, []

Valores_sindicatos = {
    'sindicato0': 0,
    'sindicato1': 13550,
    'sindicato2': 18700,
}

def ValoresSindicales (llave, valor, datos=Valores_sindicatos):
    if valor == True:
        return datos[llave]
    else :
        return 0
    return

def calcularSalario (empleados):
    salarioLegal = 908526
    for empleado in empleados:
        arl = 0
        fsp = 0
        pension = 0
        reteFuente = 0
        salarioBase = 0
        salarioTotal = 0
        salud = 0
        nombre = empleado['nombre']
        tipoContrato = empleado['tipoContrato']
        cargo = empleado['cargo']
        valoresCuotas = list(map(ValoresSindicales,empleado['sindicatos'].keys(),empleado['sindicatos'].values()))
        cuotaSindical = sum(valoresCuotas)
        if cargo == 1 :
            salarioBase = salarioLegal * 2
        elif cargo == 2 :
            salarioBase = salarioLegal * 3
        elif cargo == 3 :
            salarioBase = salarioLegal * 4
        elif cargo == 4 :
            salarioBase = salarioLegal * 5
            fsp = salarioBase * 0.01
        else :
            print("Dato ingresado no valido")
        if tipoContrato == 'PRESTACIONSERVICIOS':
            reteFuente = salarioBase * 0.06
            salud = salarioBase * 0.02
            pension = salarioBase * 0.06
            arl = 0
        elif tipoContrato == 'TERMINOFIJO':
            reteFuente = salarioBase * 0.10
            salud = salarioBase * 0.08
            pension = salarioBase * 0.02
            arl = salarioBase * 0.04
        elif tipoContrato == 'TERMINOINDEFINIDO':
            reteFuente = salarioBase * 0.05
            salud = salarioBase * 0.04
            pension = salarioBase * 0.04
            arl = salarioBase * 0.04
        elif tipoContrato == 'APRENDIZAJE':
            reteFuente = 0
            salud = 0
            pension = 0
            arl = salarioBase * 0.04
        else : 
            print('Dato ingresado no valido')
        salarioTotal = round(salarioBase - (arl + cuotaSindical+ fsp + pension + reteFuente + salud),1)
        print(f"El empleado {nombre} con tipo de contratación {tipoContrato} y cargo {cargo} tiene un salario base de {salarioBase} y los descuentos son: Retefuente {reteFuente}, Salud {salud}, Pension {pension}, ARL {arl}, FSP {fsp} y valor cuota sindical de {cuotaSindical}, para un salario total de {salarioTotal}")

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
        'cargo' : 4,
        'sindicatos' : {
            'sindicato0' : False,
            'sindicato1' : True,
            'sindicato2' : True
        }
    }
]

calcularSalario(empleados)