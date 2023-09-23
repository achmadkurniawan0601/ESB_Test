describe("Negative case Sauce Demo", () =>{
    it('Wrong password', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.get('#user-name').type('standard_user')
        cy.get('#password').type('admin')
        cy.get('#login-button').click()
        cy.get('[data-test="error"]')
    });

    it('Wrong username', () => {
        cy.visit("https://www.saucedemo.com/")
        cy.get('#user-name').type('admin')
        cy.get('#password').type('secret_sauce')
        cy.get('#login-button').click()
        cy.get('[data-test="error"]')
    });
})