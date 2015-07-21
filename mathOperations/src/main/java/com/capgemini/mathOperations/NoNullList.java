package com.capgemini.mathOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;

public class NoNullList {

public static  Collection<String> removeNullFromList(List<String> nullContainiglist){
	
	    Collection<String> filterString = Collections2.filter(nullContainiglist, Predicates.notNull());
	   // Collection<String> filterStrings = Collections2
	     //       .filter(list, Predicates.notNull());
return filterString;
	  
}
 
	
	
}
