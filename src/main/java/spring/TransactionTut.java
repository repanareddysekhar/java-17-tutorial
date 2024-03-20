package spring;

public class TransactionTut {
    /*
        We can use @Transactional to wrap a method in a database transaction.
        It allows us to set propagation, isolation, timeout, read-only, and rollback conditions for our transaction. We can also specify the transaction manager.

        Spring create a proxy or manipulates the class byte-code to manage the creation, commit and rollback of transaction.

        We can put annotation on definitions of interfaces, classes or directly on methods.
        They override each other based on precedence.

        Precedence order:: interface -> superclass -> class -> interface method -> superclass method -> class method


        Spring applies the class-level annotation to all public methods of this class that we did not annotate with @Transactional.
        However, if we put the annotation on a private or protected method, Spring will ignore it without an error.

        Transaction propagation:: defines business logic's boundary
        Spring calls TransactionManager::getTransaction according to propagation
        1. REQUIRED:: REQUIRED is the default propagation. Spring checks if there is an active transaction, and if nothing exists, it creates a new one. Otherwise, the business logic appends to the currently active transaction.
        if (isExistingTransaction()) {
            if (isValidateExistingTransaction()) {
                validateExisitingAndThrowExceptionIfNotValid();
            }
            return existing;
        }
        return createNewTransaction();

        2. SUPPORTS:: For SUPPORTS, Spring first checks if an active transaction exists. If a transaction exists, then the existing transaction will be used. If there isn’t a transaction, it is executed non-transactional:
        if (isExistingTransaction()) {
            if (isValidateExistingTransaction()) {
                validateExisitingAndThrowExceptionIfNotValid();
            }
            return existing;
        }
        return emptyTransaction;

        Example: Easiest example I can think of would be a method that sends some content to a JMS server. If you are in the context of a transaction, you want the message to be coupled to the transaction scope. But if there isn't already a transaction running, why bother calling the transaction server also and starting one just to do a one-off message?

        3. MANDATORY:: When the propagation is MANDATORY, if there is an active transaction, then it will be used. If there isn’t an active transaction, then Spring throws an exception:
        if (isExistingTransaction()) {
            if (isValidateExistingTransaction()) {
                validateExisitingAndThrowExceptionIfNotValid();
            }
            return existing;
        }
        throw IllegalTransactionStateException;

        4. NEVER
        5. NOT_SUPPORTED
        6. REQUIRES_NEW
        7. NESTED


        Transaction Isolation::
        Problems:: DirtyRead, NonRepeatableRead, PhantomRead


        DEFAULT(-1),
        READ_UNCOMMITTED(1),
        READ_COMMITTED(2),
        REPEATABLE_READ(4),
        SERIALIZABLE(8);
     */
}
