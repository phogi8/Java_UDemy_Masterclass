package sec11;

public class SearchTree implements NodeList {

    ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (root == null) {
            root = listItem;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        performRemoval(listItem, root);
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {

    }

    @Override
    public void traverse(ListItem listItem) {

    }




}
