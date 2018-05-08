package Application;

public class IR 
{
	private static float tranches[]={0,28001,40000,50001,60001,150000};
	private static int tauxIR[]={0,12,24,34,38,40};
	
	public static int getIR(float salaire)
	{
		int taux=0;
		if(salaire >=tranches[0] && salaire<=tranches[1])
		{
			taux= 0;
		}
		else
		{
			if(salaire >=tranches[1] && salaire<=tranches[2])
			{
				taux= 12;
			}
			else
			{
				if(salaire >=tranches[2] && salaire<=tranches[3])
				{
					taux= 24;
				}
				else
				{
					if(salaire >=tranches[3] && salaire<=tranches[4])
					{
						taux= 34;
					}
					else
					{
						if(salaire >=tranches[4] && salaire<=tranches[5])
						{
							taux= 38;
						}
						else
						{
							if(salaire >=tranches[5])
							{
								taux= 40;
							}
						}
					}
				}
			}
			
		}
		return taux;
	}
	

}
