/*******************************************************************************
 * Copyright (c) 2011, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.core.options;

/**
 * Enumeration of node alignment options. To be accessed using {@link CoreOptions#ALIGNMENT}.
 *
 * @author msp
 */
public enum Alignment {
    
    /** automatic alignment (default). */
    AUTOMATIC,
    /** left alignment. */
    LEFT,
    /** right alignment. */
    RIGHT,
    /** top alignment. */
    TOP,
    /** bottom alignment. */
    BOTTOM,
    /** center alignment. */
    CENTER;

}
