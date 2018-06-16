/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

/**
 *
 * @author Vikas
 */
public class PrintSvc implements Service{

    public PrintSvc() {
    }
    
    
    

    @Override
    public void send(String str) {
        try{
            String defaultPrinter = PrintServiceLookup.lookupDefaultPrintService().getName();
	    	PrintService service = PrintServiceLookup.lookupDefaultPrintService();
        InputStream is = new ByteArrayInputStream(str.toString().getBytes("UTF8"));
	    	PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
	    	pras.add(new Copies(1));
	    	DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
	    	Doc doc = new SimpleDoc(is, flavor, null);
	    	DocPrintJob job = service.createPrintJob();
	    	job.addPrintJobListener(new PrintJobAdapter() {
	      		public void printJobCanceled(PrintJobEvent pje) {
	        		allDone();
	      		}
	      		public void printJobCompleted(PrintJobEvent pje) {
	        		allDone();
	      		}
	      		public void printJobFailed(PrintJobEvent pje) {
	        		allDone();
	      		}	
	      		public void printJobNoMoreEvents(PrintJobEvent pje) {
	        		allDone();
	      		}
	      		void allDone() {
	          		System.out.println("Printing done ...");
	      		}
	    	});
	    	job.print(doc, pras);
	    	is.close();
		}
		catch (Exception e)
		{
			System.out.println("Printing failed or something!");
		}
    }
    
}
