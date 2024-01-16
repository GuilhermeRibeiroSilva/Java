package SistemaMedia;

public class MediaUnidade {
 private float nota1;
 private float nota2;
 private float nota3;
 private float nota4;
 private float nota5;
 private float nota6;
 private String materia;
 private float m3;
 
public MediaUnidade(float nota1, float nota2, float nota3, float nota4, float nota5, float nota6, String materia) {
	this.nota1 = nota1;
	this.nota2 = nota2;
	this.nota3 = nota3;
	this.nota4 = nota4;
	this.nota5 = nota5;
	this.nota6 = nota6;
	this.materia = materia;
}

public float Media() {
	m3 = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
	return m3;
}

public float getNota1() {
	return nota1;
}

public void setNota1(float nota1) {
	this.nota1 = nota1;
}

public float getNota2() {
	return nota2;
}

public void setNota2(float nota2) {
	this.nota2 = nota2;
}

public float getNota3() {
	return nota3;
}

public void setNota3(float nota3) {
	this.nota3 = nota3;
}

public float getNota4() {
	return nota4;
}

public void setNota4(float nota4) {
	this.nota4 = nota4;
}

public float getNota5() {
	return nota5;
}

public void setNota5(float nota5) {
	this.nota5 = nota5;
}

public float getNota6() {
	return nota6;
}

public void setNota6(float nota6) {
	this.nota6 = nota6;
}

public float getM3() {
	return m3;
}

public void setM3(float m3) {
	this.m3 = m3;
}

public String getMateria() {
	return materia;
}

public void setMateria(String materia) {
	this.materia = materia;
}

}
