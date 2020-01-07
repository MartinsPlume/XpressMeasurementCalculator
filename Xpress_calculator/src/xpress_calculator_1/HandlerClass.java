package xpress_calculator_1;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

public class HandlerClass implements FocusListener {
	DecimalFormat df=new DecimalFormat();
	public double Line_Volume(double parcel_Length,double parcel_Width, double parcel_Height,int piece_Count) {
		return parcel_Length*
				parcel_Width*
				parcel_Height*
				piece_Count*
				Math.pow(10, -6);
	}
	public double Line_Volume_Imperial(double parcel_Length,double parcel_Width, double parcel_Height,int piece_Count) {
		return parcel_Length*
				parcel_Width*
				parcel_Height*
				piece_Count*
				1.64*
				Math.pow(10, -5);
				
	}
	public double Line_Weight(double parcel_Weight,int piece_Count) {
		return 
				parcel_Weight*
				piece_Count;
	}
	public double Line_Weight_Imperial(double parcel_Weight,int piece_Count) {
		return 
				parcel_Weight*
				piece_Count*
				0.454;
	}
	
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub

	}

}
