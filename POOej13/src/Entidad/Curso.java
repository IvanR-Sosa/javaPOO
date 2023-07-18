
package Entidad;


public class Curso {
private String nombreCurso;
private int HorasDia;
private int DiasSemana;
private String turno;
private int precioHora;
private String []alumnos=new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int HorasDia, int DiasSemana, String turno, int precioHora) {
        this.nombreCurso = nombreCurso;
        this.HorasDia = HorasDia;
        this.DiasSemana = DiasSemana;
        this.turno = turno;
        this.precioHora = precioHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDia() {
        return HorasDia;
    }

    public void setHorasDia(int HorasDia) {
        this.HorasDia = HorasDia;
    }

    public int getDiasSemana() {
        return DiasSemana;
    }

    public void setDiasSemana(int DiasSemana) {
        this.DiasSemana = DiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", HorasDia=" + HorasDia + ", DiasSemana=" + DiasSemana + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + alumnos + '}';
    }


}
