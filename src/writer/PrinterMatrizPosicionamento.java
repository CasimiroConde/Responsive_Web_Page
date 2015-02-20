package writer;

import instancia.Solucao;
import classes.Modelo;

public class PrinterMatrizPosicionamento 
{
	public StringBuffer executa(MatrizPosicionamento matriz, Solucao solucao, Modelo modelo)
	{
		StringBuffer buffer = new StringBuffer();
		MatrizPosicionamento matrix =  new MatrizPosicionamento();
		matrix = ConstrutorMatrizPosicionamento.executa(solucao, modelo);
		
		buffer.append("<div style='display: table'>");
		for(int i = 0 ; i < matrix.getLinhas() ; i++){
			buffer.append("<div style='display: table-row'>");
			for(int j = 0 ; j < matrix.getColunas() ; j++){
				if(matrix.getCelula(i, j) != -1){
					buffer.append("<div style='display: table-cell'>");
					buffer.append("<img src = ");
				}
			}
		}
		
		// display: table-cell, table-row, table-cell
		return new StringBuffer();
	}
}