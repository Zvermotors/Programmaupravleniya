package programmaupravleniya;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    Node root;

    // Вставка нового значения в дерево
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Бинарный поиск в дереве
    public String search(int value) {
        Node result = searchRec(root, value);
        if (result != null) {
            return "Найдено: значение = " + value;
        }
        return "Значение " + value + " не найдено";
    }

    private Node searchRec(Node root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        if (value < root.value) {
            return searchRec(root.left, value);
        }

        return searchRec(root.right, value);
    }
}

