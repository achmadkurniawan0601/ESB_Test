describe("Positif case Sauce Demo", () =>{
    it('Valid Login', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.get('#user-name').type('standard_user')
        cy.get('#password').type('secret_sauce')
        cy.get('#login-button').click()
        cy.get('.title')
        cy.get('#react-burger-menu-btn').click()
        cy.get('#logout_sidebar_link').click()
    });

    it('Login and buy item', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.get('#user-name').type('standard_user')
        cy.get('#password').type('secret_sauce')
        cy.get('#login-button').click()
        cy.get('.title')

        // select item
        cy.get('[data-test="add-to-cart-sauce-labs-bike-light"]').click()
        cy.get('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click()
        cy.get('[data-test="add-to-cart-sauce-labs-backpack"]').click()

        // click trolley icon
        cy.get('.shopping_cart_link').click()

        // description item
        cy.get('.cart_desc_label')

        // checkout click
        cy.get('[data-test="checkout"]').click()

        // Checkout your information
        cy.get('[data-test="firstName"]').type('test')
        cy.get('[data-test="lastName"]').type('testing')
        cy.get('[data-test="postalCode"]').type('13147')
        cy.get('[data-test="continue"]').click()

        // sum payment
        cy.get('.summary_total_label')
        cy.get('[data-test="finish"]').click()

        // success order
        cy.get('#checkout_complete_container')

        // back to Home
        cy.get('[data-test="back-to-products"]').click()

        // logout
        cy.get('#react-burger-menu-btn').click()
        cy.get('#logout_sidebar_link').click()

    });
})