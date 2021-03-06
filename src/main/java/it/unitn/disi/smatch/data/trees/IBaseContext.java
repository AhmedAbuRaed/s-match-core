package it.unitn.disi.smatch.data.trees;

import java.util.Iterator;

/**
 * Base context interface.
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public interface IBaseContext<E extends IBaseNode> {
    /**
     * Sets a new root for the context.
     *
     * @param root a new root
     */
    void setRoot(E root);

    /**
     * Returns the root of the context.
     *
     * @return the root of the context
     */
    E getRoot();

    /**
     * Returns true if the context has a root node.
     *
     * @return true if the context has a root node
     */
    boolean hasRoot();

    /**
     * Creates a node.
     *
     * @return a node.
     */
    E createNode();

    /**
     * Creates a node with a name.
     *
     * @param name a name for a node
     * @return a node.
     */
    E createNode(String name);

    /**
     * Creates a root node.
     *
     * @return a root node.
     */
    E createRoot();

    /**
     * Creates a root node with a name.
     *
     * @param name a name for the root
     * @return the root node
     */
    E createRoot(String name);

    /**
     * Returns iterator over all context nodes.
     *
     * @return iterator over all context nodes
     */
    Iterator<E> nodeIterator();

    /**
     * Returns amount of nodes in the context.
     *
     * @return amount of nodes in the context
     */
    int nodesCount();

    String getLanguage();

    void setLanguage(String language);

}
