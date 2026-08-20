class Solution {
    public int distMoney(int money, int children) {

        // Every child needs at least $1
        if (money < children) {
            return -1;
        }

        // Give $1 to every child
        money -= children;

        // Each $8 child needs 7 extra dollars
        int ans = Math.min(money / 7, children);

        // Money used for ans children
        money -= ans * 7;

        // Number of children who don't have $8
        int remaining = children - ans;

        // All children have $8 but money is still left
        // -> one child must lose its $8
        if (remaining == 0 && money > 0) {
            ans--;
        }

        // One child remains and it would receive $4
        // ($1 + $3), which is not allowed
        if (remaining == 1 && money == 3) {
            ans--;
        }

        return ans;
    }
}