import java.util.Scanner;

public class Ej1_MorenoLuque_Manuel 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);

		double dPeso, dAltura, dIMC;
		
		String sDiagnostico = ("");
		
		System.out.println("Introduce el peso en kg:");
		dPeso = entrada.nextDouble();
		
		System.out.println("Introduce la altura en metros:");
		dAltura = entrada.nextDouble();
		
		dIMC = dPeso / (dAltura * dAltura);
		
		if (dIMC < 18.5)
		{
			sDiagnostico = ("Bajo peso");
		}
		else if (dIMC >= 18.5 && dIMC < 24.9)
		{
			sDiagnostico = ("Peso normal (saludable)");
		}
		else if (dIMC >= 25 && dIMC < 29.9)
		{
			sDiagnostico = ("Sobrepeso");
		}
		else if (dIMC >= 30 && dIMC <= 40)
		{
			sDiagnostico = ("Obesidad premórbida");
		}
		else if (dIMC > 40)
		{
			sDiagnostico = ("Obesidad mórbidad");
		}
		
		System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f y tiene un diagnostico de %s", dPeso, dAltura, dIMC, sDiagnostico);
		
		entrada.close();		
	}

}
