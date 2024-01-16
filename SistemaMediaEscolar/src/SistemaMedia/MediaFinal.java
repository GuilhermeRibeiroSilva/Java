package SistemaMedia;

public class MediaFinal  {
     private float media1;
     private float media2;
     private float media3;
     private String materia;
     private float tp;
     
	public MediaFinal(float media1, float media2, float media3 , String materia) {
		this.media1 = media1;
		this.media2 = media2;
		this.media3 = media3;
		medFinal();
		this.materia = materia;
	}
	
	public void medFinal() {
		tp = media1*3 + media2*3 + media3*4;
	}
	public String situ() {
        if(tp >= 60) {
            return "Parabens!!! Voce ja foi aprovado em " + this.getMateria();
        } else {
            return "Que pena :( Voce ainda nao foi aprovado em " + this.getMateria();
        }
    }

	public float getMedia1() {
		return media1;
	}

	public void setMedia1(float media1) {
		this.media1 = media1;
	}

	public float getMedia2() {
		return media2;
	}

	public void setMedia2(float media2) {
		this.media2 = media2;
	}

	public float getMedia3() {
		return media3;
	}

	public void setMedia3(float media3) {
		this.media3 = media3;
	}

	public float getTp() {
		return tp;
	}

	public void setTp(float tp) {
		this.tp = tp;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	

}
