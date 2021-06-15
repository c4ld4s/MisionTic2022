#OBJETIVO=Elaborar un programa que implemente una función para calcular el salario mensual que la empresa debe pagar a un empleado. 

nombre, tipoContrato, cargo  = str, str, int

def calcularSalario(nombre , tipoContrato, cargo): 
    saldoBase = 908526
    diccionario = {}
    if tipoContrato == 'PRESTACIONSERVICIOS' and cargo == 1:
        saldoBase = saldoBase*2
        reteFuente = saldoBase*0.06
        salud = saldoBase*0.02
        pension = saldoBase*0.06
        arl = saldoBase*0
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'PRESTACIONSERVICIOS' and cargo == 2:
        saldoBase = saldoBase*3
        reteFuente = saldoBase*0.06
        salud = saldoBase*0.02
        pension = saldoBase*0.06
        arl = saldoBase*0          
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'TERMINOFIJO' and cargo == 1:
        saldoBase = saldoBase*2
        reteFuente = saldoBase*0.10
        salud = saldoBase*0.08
        pension = saldoBase*0.02
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'TERMINOFIJO' and cargo == 2:
        saldoBase = saldoBase*3
        reteFuente = saldoBase*0.10
        salud = saldoBase*0.08
        pension = saldoBase*0.02
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'TERMINOINDEFINIDO'and cargo == 1:
        saldoBase = saldoBase*2
        reteFuente = saldoBase*0.05
        salud = saldoBase*0.04
        pension = saldoBase*0.04
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'TERMINOINDEFINIDO'and cargo == 2:
        saldoBase = saldoBase*3
        reteFuente = saldoBase*0.05
        salud = saldoBase*0.04
        pension = saldoBase*0.04
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'APRENDIZAJE' and cargo == 1:
        saldoBase = saldoBase*2
        reteFuente = saldoBase*0
        salud = saldoBase*0
        pension = saldoBase*0
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    elif tipoContrato == 'APRENDIZAJE' and cargo == 2:
        saldoBase = saldoBase*3
        reteFuente = saldoBase*0
        salud = saldoBase*0
        pension = saldoBase*0
        arl = saldoBase*0.04
        salarioTotal = saldoBase - reteFuente - salud - pension - arl
        diccionario = {'nombre': nombre.upper(),'tipo contratación': tipoContrato, 'cargo' : cargo, 'salario base':saldoBase, 'retefuente':reteFuente,'salud':salud,'pension':pension,'arl': arl, 'salario total': round(salarioTotal,2)}
        return diccionario
    else :
        return print("error")
    return print(diccionario)

print(calcularSalario("Juan David", "TERMINOFIJO", 2))
