package p2023_07_26;

import java.awt.*;
import java.awt.event.*;

public class FrameTest {
	
    private Frame f;

    public FrameTest() {	
		f = new Frame( "Frame Test" );	
		f.setSize( 400, 300 );  //setSize()메소드 상속 받아 쓰는것
		f.setLocation( 100, 100 );
		f.setBackground( Color.green );
		f.setVisible( true );
		f.setResizable(false);   //주석처리하면 직접 조절해서 쓸수있다.  

	f.addWindowListener( new WindowAdapter() {
		    public void windowClosing( WindowEvent e ) {
				System.exit( 0 );
		    }
    });

	}//생성자 end

    public static void main( String[] args ) {
		FrameTest ft = new FrameTest();
    }
}