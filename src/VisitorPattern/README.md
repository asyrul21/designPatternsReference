
# Visitor Pattern

TODO: Visitor brief description

Related Example: Composite Pattern

## Design Solution (Composite Visitor)

### The Composite Pattern Solution:

We will refer to the exact example of the one found in Composite Pattern.

![Composite Pattern Solution](images/composite-solution.jpg)

### The Visitor Pattern for Composite Solution:

![Composite Visitor Pattern Solution](images/visitor-solution.jpg)

## Example 1: The Merged Menu with Desserts, but there are two types of MenuItems

### The tree structure:

![Composite Pattern Example 1 Tree](images/composite-example1-tree.jpg)

### Composite pattern example:

![Composite Pattern Example 1](images/composite-example1.jpg)

For this example we shall make a few modifications to the initial implementation of Composite Pattern Example 1:

1. We remove the `isVegetarian` property
2. `MenuItem` is now abstract, with Concrete elements of `NormalMenuItem` and `VegetarianMenuItem`
3. The Visitor will attempt to visit each of these concrete menuItems, performing specific tasks. In our case, one visitor will compute their total price, and on will compile the names of each type of menuItems.

### Composite Visitor Pattern example:

![Visitor Pattern Example 1](images/visitor-example1.jpg)



## Other Examples

[Example in NodeJS](https://github.com/asyrul21/design-patterns-nodejs/tree/master/structural/composites)





