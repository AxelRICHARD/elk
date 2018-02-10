/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.spore;

import org.eclipse.elk.alg.spore.graph.Graph;

/**
 * Interface for importer classes for graph structure.
 * @param <T> the type of graph that this importer can transform into a Graph.
 */
public interface IGraphImporter<T> {

    /**
     * Create a {@link Graph} from the given graph.
     * @param inputGraph
     * @return a Graph
     */
    Graph importGraph(T inputGraph);
    
    /**
     * Apply the positions from the compact version to the original graph.
     * @param graph the Graph that the new positions should be applied to
     */
    void applyPositions(Graph graph);

    /**
     * Update the original positions in a {@link Graph} with the modified ones.
     * @param graph the {@link Graph}
     */
    void updateGraph(Graph graph);
}
