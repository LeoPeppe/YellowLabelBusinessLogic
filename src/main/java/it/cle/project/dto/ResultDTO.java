package it.cle.project.dto;

import java.io.Serializable;
import java.util.Map;

import com.google.common.collect.Maps;


// TODO: Auto-generated Javadoc
/**
 * The Class ResultDTO.
 */
public class ResultDTO implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The map. */
	Map<String, Object>  map = Maps.newHashMap();

	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public Map<String, Object> getMap() {
		return map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map the map
	 */
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

}
