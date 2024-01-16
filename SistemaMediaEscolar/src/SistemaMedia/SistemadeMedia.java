package SistemaMedia;

public class SistemadeMedia {

	public static void main(String[] args) {
		quantoFalta q[] = new quantoFalta[9];
		q[0] = new quantoFalta(6.2f,6.0f, "Portugues");
		System.out.println("Voce precisa de " + q[0].TotPontos()  + " em " + q[0].getMateria() );
		
		q[1] = new quantoFalta(8.5f,8.5f,"Historia");
		System.out.println("Voce precisa de " + q[1].TotPontos()  + " em " + q[1].getMateria() );
		
		q[2] = new quantoFalta(7.0f,9.3f, "Geografia");
		System.out.println("Voce precisa de " + q[2].TotPontos()  + " em " + q[2].getMateria() );
		
		q[3] = new quantoFalta(6.0f,7.6f, "Matematica");
		System.out.println("Voce precisa de " + q[3].TotPontos()  + " em " + q[3].getMateria() );
		
		q[4] = new quantoFalta(8.2f,6.9f, "Ciencias");
		System.out.println("Voce precisa de " + q[4].TotPontos()  + " em " + q[4].getMateria() );
		
		q[5] = new quantoFalta(6.0f,8.6f, "Ingles");
		System.out.println("Voce precisa de " + q[5].TotPontos()  + " em " + q[5].getMateria() );
		
		q[6] = new quantoFalta(7.6f,6.4f, "Arte");
		System.out.println("Voce precisa de " + q[6].TotPontos()  + " em " + q[6].getMateria() );
		
		q[7] = new quantoFalta(8.1f,8.0f, "Religião");
		System.out.println("Voce precisa de " + q[7].TotPontos()  + " em " + q[7].getMateria() );
		
		q[8] = new quantoFalta(6.8f,7.4f, "Redacao");
		System.out.println("Voce precisa de " + q[8].TotPontos()  + " em " + q[8].getMateria() );
		
		System.out.println("\n");
		System.out.println("\n");
		
		/*MediaUnidade mu[] = new MediaUnidade[9];
		mu[0] = new MediaUnidade(1.5f,1.5f,1.0f,0.9f,0.0f,0.0f,"Portugues");
		System.out.println("Voce ja tem " + mu[0].Media()  + " Pontos em " + mu[0].getMateria() );
		
		mu[1] = new MediaUnidade(1.2f,2.4f,1.0f,0.9f,0.0f,0.0f,"Historia");
		System.out.println("Voce ja tem " + mu[1].Media()  + " Pontos em " + mu[1].getMateria() );
		
		mu[2] = new MediaUnidade(1.2f,1.0f,1.0f,0.9f,0.0f,0.0f, "Geografia");
		System.out.println("Voce ja tem " + mu[2].Media()  + " Pontos em " + mu[2].getMateria() );
		
		mu[3] = new MediaUnidade(2.1f,0.0f,1.0f,0.9f,0.0f,0.0f, "Matematica");
		System.out.println("Voce ja tem " + mu[3].Media()  + " Pontos em " + mu[3].getMateria() );
		
		mu[4] = new MediaUnidade(2.1f,0.0f,1.0f,0.9f,0.0f,0.0f, "Ciencias");
		System.out.println("Voce ja tem " + mu[4].Media()  + " Pontos em " + mu[4].getMateria() );
		
		mu[5] = new MediaUnidade(1.8f,0.0f,1.0f,0.9f,0.0f,0.0f, "Ingles");
		System.out.println("Voce ja tem " + mu[5].Media()  + " Pontos em " + mu[5].getMateria() );
		
		mu[6] = new MediaUnidade(1.5f,0.2f,1.0f,0.9f,0.0f,0.0f, "Arte");
		System.out.println("Voce ja tem " + mu[6].Media()  + " Pontos em " + mu[6].getMateria() );
		
		mu[7] = new MediaUnidade(1.5f,1.8f,1.0f,0.9f,0.0f,0.0f, "Religião");
		System.out.println("Voce ja tem " + mu[7].Media()  + " Pontos em " + mu[7].getMateria() );
		
		mu[8] = new MediaUnidade(4.0f,2.0f,1.0f,0.0f,0.0f,0.0f, "Redacao");
		System.out.println("Voce ja tem " + mu[8].Media()  + " Pontos em " + mu[8].getMateria() );
		
		System.out.println("\n");
		System.out.println("\n");
		
		
		MediaFinal mf[] = new MediaFinal[9];
		mf[0] = new MediaFinal(6.7f,5.5f,4.9f,"Portugues");
		System.out.println(mf[0].situ());
		
		mf[1] = new MediaFinal(9.3f,9.5f,5.5f,"Historia");
		System.out.println(mf[1].situ());
		
		mf[2] = new MediaFinal(8.1f,7.8f,4.1f, "Geografia");
		System.out.println(mf[2].situ());
		
		mf[3] = new MediaFinal(7.8f,8.5f,4.0f, "Matematica");
		System.out.println(mf[3].situ());
		
		mf[4] = new MediaFinal(9.9f,7.5f,4.0f, "Ciencias");
		System.out.println(mf[4].situ());
		
		mf[5] = new MediaFinal(6.1f,7.0f,3.6f, "Ingles");
		System.out.println(mf[5].situ());
		
		mf[6] = new MediaFinal(8.0f,7.5f,3.6f, "Arte");
		System.out.println(mf[6].situ());
		
		mf[7] = new MediaFinal(8.0f,9.0f,5.2f, "Religião");
		System.out.println(mf[7].situ());
		
		mf[8] = new MediaFinal(5.6f,8.3f,7.0f, "Redacao");
		System.out.println(mf[8].situ());*/
		

	}

}
