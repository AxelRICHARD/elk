/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.alg.disco.transform;

import org.eclipse.elk.alg.disco.graph.DCGraph;

/**
 * Interface for transforming any graph structure into a {@link DCGraph}, in order to use layout algorithms provided by
 * DisCo for compacting disconnected components of the given graph.
 *
 * @param <G>
 */
public interface IGraphTransformer<G> {

    /**
     * Transforms the given graph into a {@link DCGraph}.
     * 
     * @param graph
     * @return
     */
    DCGraph importGraph(G graph);

    /**
     * Applies the changes made to its associated {@link DCGraph} back to the original graph (presumably after a layout
     * algorithm has been used).
     */
    void applyLayout();
}
