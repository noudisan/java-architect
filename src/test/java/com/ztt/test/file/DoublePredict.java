package com.ztt.test.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class DoublePredict {
	public static void main(String[] args) throws Exception {
		Map<String,Integer> red = new TreeMap<String,Integer>();
		Map<String,Integer> blue=new TreeMap<String,Integer>();
		File file = new File("C:\\Users\\zhoutaotao.CHINADRTV\\Desktop\\Noname2.txt");
		InputStreamReader read = new InputStreamReader(new FileInputStream(file),"utf-8");
		BufferedReader bufferedReader = new BufferedReader(read);
		String lineTxt = null;
        while((lineTxt = bufferedReader.readLine()) != null){
        	String[] array = lineTxt.split(" ");
        	for(int i =0;i<array.length;i++){
        		String key = array[i];
        		if(i==array.length-1){
        			if(blue.containsKey(key)){
        				blue.put(key, blue.get(key)+1);
            		}else{
            			blue.put(key, 1);
            		}
        		}else{
        			if(red.containsKey(key)){
            			red.put(key, red.get(key)+1);
            		}else{
            			red.put(key, 1);
            		}
        		}
        		
        	}
            
        }
        read.close();
        
        for(String key :red.keySet()){
        	System.out.println("red:"+key+":"+red.get(key));
        }
        for(String key :blue.keySet()){
        	System.out.println("blue:"+key+":"+blue.get(key));
        }
	}
}
