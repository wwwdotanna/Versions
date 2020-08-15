package com.pigerly.proversions.bungee.helpers;

import java.util.ArrayList;
import java.util.HashMap;

public class BlockTranslator { 
//	HashMap<String, String> V1_16_2__1_16_1 = new HashMap<String, String>();
	ArrayList<HashMap<String, String>> versionList = new ArrayList<HashMap<String, String>>();
	
	HashMap<String, String> V1_16_1__1_16 = new HashMap<String, String>();
	HashMap<String, String> V1_16__1_16_4 = new HashMap<String, String>();
	
	HashMap<String, String> V1_15_2__1_15_1 = new HashMap<String, String>();
	HashMap<String, String> V1_15_1__1_15 = new HashMap<String, String>();
	HashMap<String, String> V1_15__1_14_4 = new HashMap<String, String>();
	
	HashMap<String, String> V1_14_4__1_14_3 = new HashMap<String, String>();
	HashMap<String, String> V1_14_3__1_14_2 = new HashMap<String, String>();
	HashMap<String, String> V1_14_2__1_14_1 = new HashMap<String, String>();
	HashMap<String, String> V1_14_1__1_14 = new HashMap<String, String>();
	HashMap<String, String> V1_14__1_13_2 = new HashMap<String, String>();
	
	HashMap<String, String> V1_13_2__1_13_1 = new HashMap<String, String>();
	HashMap<String, String> V1_13_1__1_13 = new HashMap<String, String>();
	HashMap<String, String> V1_13__1_12_2 = new HashMap<String, String>();
	
	HashMap<String, String> V1_12_2__1_12_1 = new HashMap<String, String>();
	HashMap<String, String> V1_12_1__1_12 = new HashMap<String, String>();
	HashMap<String, String> V1_12__1_11_2 = new HashMap<String, String>();
	
	HashMap<String, String> V1_11_2__1_11_1 = new HashMap<String, String>();
	HashMap<String, String> V1_11_1__1_11 = new HashMap<String, String>();
	HashMap<String, String> V1_11__1_10_2 = new HashMap<String, String>();
	
	HashMap<String, String> V1_10_2__1_10_1 = new HashMap<String, String>();
	HashMap<String, String> V1_10_1__1_10 = new HashMap<String, String>();
	HashMap<String, String> V1_10__1_9_4 = new HashMap<String, String>();
	
	HashMap<String, String> V1_9_4__1_9_3 = new HashMap<String, String>();
	HashMap<String, String> V1_9_3__1_9_2 = new HashMap<String, String>();
	HashMap<String, String> V1_9_2__1_9_1 = new HashMap<String, String>();
	HashMap<String, String> V1_9_1__1_9 = new HashMap<String, String>();
	HashMap<String, String> V1_9__1_8_9 = new HashMap<String, String>();
	
	HashMap<String, String> V1_8_9__1_8_8 = new HashMap<String, String>();
	HashMap<String, String> V1_8_8__1_8_7 = new HashMap<String, String>();
	HashMap<String, String> V1_8_7__1_8_6 = new HashMap<String, String>();
	HashMap<String, String> V1_8_6__1_8_5 = new HashMap<String, String>();
	HashMap<String, String> V1_8_5__1_8_4 = new HashMap<String, String>();
	HashMap<String, String> V1_8_4__1_8_3 = new HashMap<String, String>();
	HashMap<String, String> V1_8_3__1_8_2 = new HashMap<String, String>();
	HashMap<String, String> V1_8_2__1_8_1 = new HashMap<String, String>();
	HashMap<String, String> V1_8_1__1_8 = new HashMap<String, String>();
	
	public BlockTranslator() {
		versionList.add(V1_16_1__1_16);
		versionList.add(V1_16__1_16_4);
		
		versionList.add(V1_15_2__1_15_1);
		versionList.add(V1_15_1__1_15);
		versionList.add(V1_15__1_14_4);
		
		versionList.add(V1_14_4__1_14_3);
		versionList.add(V1_14_3__1_14_2);
		versionList.add(V1_14_2__1_14_1);
		versionList.add(V1_14_1__1_14);
		versionList.add(V1_14__1_13_2);
		
		versionList.add(V1_13_2__1_13_1);
		versionList.add(V1_13_1__1_13);
		versionList.add(V1_13__1_12_2);
		
		versionList.add(V1_12_2__1_12_1);
		versionList.add(V1_12_1__1_12);
		versionList.add(V1_12__1_11_2);
		
		versionList.add(V1_10_2__1_10_1);
		versionList.add(V1_10_1__1_10);
		versionList.add(V1_10__1_9_4);
		
		versionList.add(V1_9_4__1_9_3);
		versionList.add(V1_9_3__1_9_2);
		versionList.add(V1_9_2__1_9_1);
		versionList.add(V1_9_1__1_9);
		versionList.add(V1_9__1_8_9);
		
		versionList.add(V1_8_9__1_8_8);
		versionList.add(V1_8_8__1_8_7);
		versionList.add(V1_8_7__1_8_6);
		versionList.add(V1_8_6__1_8_5);
		
		versionList.add(V1_8_5__1_8_4);
		versionList.add(V1_8_4__1_8_3);
		versionList.add(V1_8_3__1_8_2);
		versionList.add(V1_8_2__1_8_1);
		
	}
}