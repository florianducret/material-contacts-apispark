package net.apispark.webapi;

import net.apispark.webapi.db.ContactPersistence;
import net.apispark.webapi.representation.Contact;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by Utilisateur on 26/10/2016.
 */
public class ContactPersistenceTest {
    @Test
        public void CheckIdNewContact() throws Exception {
                Contact contact = new Contact(null, "Bob", "Dylan", "svg-1");
                Contact result = ContactPersistence.INSTANCE.addContact(contact);
                Assert.assertNotNull(result.getId());
                Assert.assertThat(contact.getFirstName(), is("Bob"));
                Assert.assertThat(contact.getLastName(), is("Dylan"));

                    }

                @Test
        public void CheckContactNewContact() throws Exception{
                Contact contact = new Contact("azerty", "Bob", "Dylan", "svg-1");
                Contact result = ContactPersistence.INSTANCE.addContact(contact);
                Assert.assertThat(contact, is(ContactPersistence.INSTANCE.getContact("azerty")));
            }
}
