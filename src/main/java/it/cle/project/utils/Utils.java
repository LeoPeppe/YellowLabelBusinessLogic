package it.cle.project.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;


import org.apache.log4j.Logger;
import org.w3c.dom.Document;


// TODO: Auto-generated Javadoc
/**
 * The Class Utils.
 */
public final class Utils {
	
	/** The logger. */
	public Logger logger = Logger.getLogger(Utils.class);
	
	/**
	 * Round.
	 *
	 * @param value the value
	 * @param decimalpos the decimalpos
	 * @return the float
	 */
	public static float Round(float value,int decimalpos)
	{
		BigDecimal bd = new BigDecimal(Float.toString(value));
        bd = bd.setScale(decimalpos, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
	}
	
	/**
	 * Round.
	 *
	 * @param value the value
	 * @return the integer
	 */
	public static Integer Round(float value)
	{
		return Math.round(value);
		
	}
	
	
	/**
	 * Gets the property from config.
	 *
	 * @param property the property
	 * @param defaultValue the default value
	 * @return the property from config
	 */
	public static String getPropertyFromConfig(String property, String defaultValue) {
		Properties properties = new Properties(); 
		
		String res = "";

		// load a properties file
		try {
			ClassLoader cl = Thread.currentThread().getContextClassLoader();
			InputStream input = cl.getResourceAsStream("config-fattura.properties");// new FileInputStream("config-fattura.properties");
			properties.load(input);
			res = properties.getProperty(property, defaultValue);
		} catch (IOException e) {
        	
			Utils utils = new Utils();
        	utils.logger.error(getStackTrace(e));
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	/**
	 * Gets the stack trace.
	 *
	 * @param ex the ex
	 * @return the stack trace
	 */
	public static String getStackTrace(Exception ex) {
		
		StringWriter stringWriter=new StringWriter();
        PrintWriter printWriter=new PrintWriter(stringWriter);
        ex.printStackTrace(printWriter);
        
        return stringWriter.toString();
        
	}
	
	
	/**
	 * Convert string to document.
	 *
	 * @param xmlStr the xml str
	 * @return the document
	 */
	public static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
        DocumentBuilder builder;  
        System.out.println("convertStringToDocument");
        try 
        {  
            builder = factory.newDocumentBuilder(); 
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader(xmlStr));
//            Document doc = builder.parse( new InputSource( new java.io.StringReader( xmlStr ) ) );
            Document doc = builder.parse(is);
            System.out.println("DOCUMENTO: " + ((doc == null) ? "vuoto" : "pieno"));
            return doc;
        } catch (Exception e) {  
           
        	e.printStackTrace();  
        	Utils utils = new Utils();
        	utils.logger.error(getStackTrace(e));
        	
        } 
        return null;
    }
	

}
