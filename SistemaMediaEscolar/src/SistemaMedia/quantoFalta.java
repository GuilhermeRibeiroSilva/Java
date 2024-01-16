package SistemaMedia;

public class quantoFalta {
  private float media1;
  private float media2;
  private String materia;
  private float pf;
  
public quantoFalta(float media1, float media2, String materia) {
	super();
	this.media1 = media1;
	this.media2 = media2;
	this.materia = materia;
}

public float TotPontos() {
	float qntdfalta;
	float tp;
	pf = media1*3 + media2*3;
	tp = 60-pf;
	qntdfalta = tp/4;
	return qntdfalta;
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

public String getMateria() {
	return materia;
}

public void setMateria(String materia) {
	this.materia = materia;
}

public float getPf() {
	return pf;
}

public void setPf(float pf) {
	this.pf = pf;
}

}
