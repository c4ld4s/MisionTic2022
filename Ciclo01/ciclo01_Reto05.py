import pandas as pd
ruta_archivo = str 
def Tienda(ruta_archivo ):
    try:
        dataFrame = pd.read_csv(ruta_archivo ,index_col="FACTURA")
    except:
        return 'No fue posible leer los datos'
    
    ventas = dataFrame.groupby('MES')['VENTAS'].sum()
    gastos = dataFrame.groupby('MES')['GASTOS'].sum()
    perdidas = dataFrame.groupby('MES')['PERDIDA POR DEFECTO'].sum()
    datosResueltos = {
        'VENTAS' : ventas,
        'GASTOS' : gastos,
        'PERDIDA_POR_DEFECTO' : perdidas
    }

    data = pd.DataFrame(datosResueltos)
    return(data)

ruta_archivo = 'https://raw.githubusercontent.com/dsolanovivas/misionTic2022Fase1Reto5P31/main/Ventas_Tienda.csv'
print(Tienda(ruta_archivo))