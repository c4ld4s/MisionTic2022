#OBJETIVO= Función que reciba como parametros: dos números enteros (adultos, niños) que represente la cantidad de adultos y niños que tiene la familia y retorne una cadena de caracteres que le indique al cajero la información que desea obtener.

def totalPagosParque(adultos , niños):
    costoEntradaAdulto = 15000
    costoEntradaNiño = 9000
    costoTotal = int(adultos * costoEntradaAdulto + niños * costoEntradaNiño)
    costoTotalMantenimiento = costoTotal * 0.3
    costoTotalEmpleados = costoTotal * 0.45
    costoTotalGanacias = costoTotal * 0.25
    return print(str('Total a pagar por las entradas es $' + str(costoTotal) + ', Total de mantenimiento es $' + str(costoTotalMantenimiento) + ', Total del pago de empleados es $' + str(costoTotalEmpleados) + ' y el Total de ganancias es $' + str(costoTotalGanacias)))
