package com.pacmanproject.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.pacmanproject.main.Cell;
import com.pacmanproject.main.Grid;
import com.pacmanproject.main.Location;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import javafx.embed.swing.JFXPanel;

public class GridTest 
{
	


	JFXPanel j = new JFXPanel();
	
	@Test
	public void testDefaultConstructor() //tests default constructor
	{
		Grid test = new Grid();
		
		assertEquals(15,test.getGrid().length);
	}
	
	@Test
	public void testCopyConstructor() //test if new grid is == old grid
	{
		
		Grid oldgrid = new Grid();
		oldgrid.initDefGrid();
		
		Grid newgrid = new Grid(oldgrid);
		
		assertEquals(0,newgrid.getCell(1, 1).getType());
	
	}
	
	@Test
	public void testIsEmpty() //test if cell is an empty cell
	{
		
		Grid test = new Grid();
		test.initDefGrid();
		
		boolean output = test.isEmpty(1,1); 
		
		assertEquals(true,output);
		
	}
	
	@Test
	public void testIsEmpty2() //test if cell is an empty cell
	{
		JFXPanel j = new JFXPanel();
		
		Grid test = new Grid();
		test.initDefGrid();
		test.getCell(5, 3).setType(1);
		boolean output = test.isEmpty(5,3); 
		
		assertEquals(false,output);
		
		
	}
	
	
	@Test
	public void addCell() //test if cell is an empty cell
	{
		
		Grid test = new Grid();
		
		test.addCell(new Cell(new Location(1,1),1));
		
		
		
		assertEquals(1,test.getCell(1, 1).getType());
		
	}





}
