/**
 * 
 */
package com.grampanchayat.utils;

import android.util.Log;

public class Logger  {

	private static final  String TAG = "GRAMPANCHAYAT";
	
	private static final boolean DEBUG = true;
	
	/**
	 * I.
	 * 
	 * @param msgString
	 *            the msg string
	 */
	public static void i(String msgString){
		if (DEBUG) {
			Log.i(TAG,msgString);
		}
	}
	
	/**
	 * D.
	 * 
	 * @param msgString
	 *            the msg string
	 */
	public static void d(String msgString){
		if (DEBUG) {
			Log.d(TAG,msgString);
		}
	}
	
	/**
	 * E.
	 * 
	 * @param msgString
	 *            the msg string
	 */
	public static void e(String msgString){
		if (DEBUG) {
			Log.e(TAG,msgString);
		}
	}
	
	/**
	 * W.
	 * 
	 * @param msgString
	 *            the msg string
	 */
	public static void w(String msgString){
		if (DEBUG) {
			Log.w(TAG,msgString);
		}
	}
	
	/**
	 * V.
	 * 
	 * @param msgString
	 *            the msg string
	 */
	public static void v(String msgString){
		if (DEBUG) {
			Log.v(TAG,msgString);
		}
	}
	
}
