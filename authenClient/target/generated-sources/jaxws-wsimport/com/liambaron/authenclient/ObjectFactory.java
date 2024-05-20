
package com.liambaron.authenclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liambaron.authenclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Details_QNAME = new QName("http://authen.liambaron.com/", "details");
    private final static QName _User_QNAME = new QName("http://authen.liambaron.com/", "user");
    private final static QName _DetailsResponse_QNAME = new QName("http://authen.liambaron.com/", "detailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liambaron.authenclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DetailsResponse }
     * 
     */
    public DetailsResponse createDetailsResponse() {
        return new DetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Details }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authen.liambaron.com/", name = "details")
    public JAXBElement<Details> createDetails(Details value) {
        return new JAXBElement<Details>(_Details_QNAME, Details.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authen.liambaron.com/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://authen.liambaron.com/", name = "detailsResponse")
    public JAXBElement<DetailsResponse> createDetailsResponse(DetailsResponse value) {
        return new JAXBElement<DetailsResponse>(_DetailsResponse_QNAME, DetailsResponse.class, null, value);
    }

}
