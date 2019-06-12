package ej8;

public class Vector3D extends Punto {
	private float z;
	public Vector3D(float i,float j, float n) {
		super(i,j);
		this.z=n;
	}
	public void setZ(float n) {
		this.z = n;
	}
	public float getZ() {
		return (this.z);
	}
	public boolean esigual(float x1,float y1,float z1,float x2,float y2,float z2) {
		return (super.esigual(x1, y1, x2, y2)) && (z1 == z2);
	}
}
