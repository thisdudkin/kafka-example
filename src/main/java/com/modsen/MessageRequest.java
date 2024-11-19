package com.modsen;

import java.io.Serializable;

/**
 * @author Alexander Dudkin
 */
public record MessageRequest(String message) implements Serializable {
}
