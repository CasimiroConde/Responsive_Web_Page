package writer;

import instancia.Solucao;
import classes.Modelo;

public class ConstrutorMatrizPosicionamento {

	public MatrizPosicionamento executa(Solucao solucao, Modelo modelo)
	{
		MatrizPosicionamento m = new MatrizPosicionamento();
		m.adicionaComponenteInicial(0);
				
		for(int i = 1; i < solucao.tamanhoSolucao(); i++)
		{
			double fatorPosicao = solucao.pegaUnidadeSolucaoIndice(i).getFatorPosicao();
			boolean ok;

			if (fatorPosicao < 0.125)
			{
				ok = m.adicionaNoroeste(i);
			}
			else if (fatorPosicao < 0.25)
			{
				ok = m.adicionaNorte(i);
			}
			else if (fatorPosicao < 0.375)
			{
				ok = m.adicionaNordeste(i);
			}
			else if (fatorPosicao < 0.5)
			{
				ok = m.adicionaOeste(i);
			}
			else if (fatorPosicao < 0.625)
			{
				ok = m.adicionaLeste(i);
			}
			else if (fatorPosicao < 0.75)
			{
				ok = m.adicionaSudoeste(i);
			}
			else if (fatorPosicao < 0.875)
			{
				ok = m.adicionaSul(i);
			}
			else
			{
				ok = m.adicionaSudeste(i);
			}
			
			if (!ok)
				return null;
		}
		
		return m;
	}
}