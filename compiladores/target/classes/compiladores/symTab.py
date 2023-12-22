import pandas as pd
import dataframe_image as dfi

# Se abre el archivo de texto que incluye el String de la tabla de simbolos
fin = open("Tabla_de_Simbolos.txt")
fout = open("tablaSimbolos.txt", "wt")
# Se reemplazan los 'null' por 'Null', con el objetivo de interpretarlos correctamente en el dataFrame
for line in fin:
	fout.write(line.replace('null', 'Null'))
for linea in fin:
    fout.write(linea.replace(';', ''))
# Se cierran los archivos
fin.close()
fout.close()
# Se lee el nuevo archivo de texto y se crea un dataframe de Pandas
df = pd.read_table('tablaSimbolos.txt',sep='&')
#Se exporta el dataFrame como png
dfi.export(df, 'TablaSimbolos.png')