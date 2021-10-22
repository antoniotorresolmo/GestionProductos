package models;

public class Producto {
	
	private String sNombre;
	private float fPrecio;
	private int iStock;
	private boolean boFragil;
	private String sRutaImagen;
	
	public Producto(String sNombre) {
		this.setsNombre(sNombre);
	}
	
	public Producto(String sNombre, float fPrecio, int iStock, boolean boFragil, String sRutaImagen) {
		this.setsNombre(sNombre);
		this.setfPrecio(fPrecio);
		this.setiStock(iStock);
		this.setBoFragil(boFragil);
		this.setsRutaImagen(sRutaImagen);
	}
	
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		if(sNombre.length() <= 25) {
			this.sNombre = sNombre;
		}
	}
	public float getfPrecio() {
		return fPrecio;
	}
	public void setfPrecio(float fPrecio) {
		if(fPrecio >= 0) {
			this.fPrecio = fPrecio;
		}		
	}
	public int getiStock() {
		return iStock;
	}
	public void setiStock(int iStock) {
		if(iStock >= 0) {
			this.iStock = iStock;
		}		
	}
	public boolean isBoFragil() {
		return boFragil;
	}
	public void setBoFragil(boolean boFragil) {
		this.boFragil = boFragil;
	}
	public String getsRutaImagen() {
		return sRutaImagen;
	}
	public void setsRutaImagen(String sRutaImagen) {
		this.sRutaImagen = sRutaImagen;
	}

	public String toString() {
		return "Producto [sNombre=" + sNombre + ", fPrecio=" + fPrecio + ", iStock=" + iStock + ", boFragil=" + boFragil
				+ ", sRutaImagen=" + sRutaImagen + "]";
	}

}
