package sec11;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightLink = listItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        leftLink = listItem;
        return leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (this.value.hashCode() < listItem.value.hashCode()) {
            return -1;
        }
        else if (this.value.hashCode() == listItem.value.hashCode()) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
