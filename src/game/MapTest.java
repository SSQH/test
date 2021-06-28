package game;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {

	private static Map map=new Map();
	private static Cell [][]cell=new Cell[16][16];
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cell=map.initial();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		;
	}

	@Test
	public void testGetliving() {
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				cell[i][j].setStatus(1);
			}
		}
		map.getliving(cell);
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				if(i>0&&i<15&&j>0&&j<15) assertEquals(8,cell[i][j].getLivingNum());
				else if((i==0||i==15)&&(j>0&&j<15)||(j==0||j==15)&&(i>0&&i<15)) assertEquals(5,cell[i][j].getLivingNum());
				else assertEquals(3,cell[i][j].getLivingNum());
			}
		}
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				cell[i][j].setStatus(0);
			}
		}
		map.getliving(cell);
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				assertEquals(0,cell[i][j].getLivingNum());
			}
		}
		cell[0][0].setStatus(1);
		cell[0][2].setStatus(1);
		cell[2][0].setStatus(1);
		map.getliving(cell);
		assertEquals(3,cell[1][1].getLivingNum());
		
		

	}

	@Test
	public void testUpdateMap() {
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				cell[i][j].setStatus(1);
			}
		}
		map.getliving(cell);
		assertEquals(4,map.UpdateMap(cell));
		for(int i=0;i<16;i++) {
			for(int j=0;j<16;j++) {
				cell[i][j].setStatus(0);
			}
		}
		map.getliving(cell);
		assertEquals(256,map.UpdateMap(cell));
	}

	}


