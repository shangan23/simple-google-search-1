package com.google.search.googlesearch.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
class SearchAutoCompleteServiceTest {
	
	@Test
	void testSearchAutoCompleteService() {
		ArrayList<String> results,expectedResults = new ArrayList<String>();
		SearchAutoCompleteService searchAutoCompleteService = new SearchAutoCompleteService();
		results = searchAutoCompleteService.findByKeywordUsingStream("ama");
		expectedResults.add("amazon");
		expectedResults.add("amazon prime");
		expectedResults.add("amazon API");
		expectedResults.add("amazon registry search");
		expectedResults.add("amazon uk");
		assertEquals(expectedResults,results);
	}
	
	@Test
	void testSearchAutoCompleteServiceForLoop() {
		ArrayList<String> results,expectedResults = new ArrayList<String>();
		SearchAutoCompleteService searchAutoCompleteService = new SearchAutoCompleteService();
		results = searchAutoCompleteService.findByKeywordUsingLoop("ama");
		expectedResults.add("amazon");
		expectedResults.add("amazon prime");
		expectedResults.add("amazon API");
		expectedResults.add("amazon registry search");
		expectedResults.add("amazon uk");
		assertEquals(expectedResults,results);
	}

}
