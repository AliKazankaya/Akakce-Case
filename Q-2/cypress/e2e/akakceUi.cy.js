
describe('Akakce.com Testi', () => {


  it('Kullanici giriş yapar', () => {
    // Giriş yapma işlemi
    cy.visit(Cypress.config().baseUrl); // configde tutulan BaseUrl
    
    cy.wait(500)

    cy.get('a[href="/akakcem/giris/"]:visible').click();  // Giriş yap linkine tıklama
    cy.get('input#life').type(Cypress.config().username);  // Email alanını doldurma
    cy.get('input#lifp').type(Cypress.config().password);  // Şifre alanını doldurma
    cy.get('#lfb').click();  // Giriş butonuna tıklama
  });

 it('Kullanici arama yapar', () => {
    // Arama yapma işlemi
    cy.get('input[name="q"]').type('iphone{enter}');  // Arama kutusuna iphone yazıp Enter'a basma
    cy.clearCookies()
  });

  it('Kullanici arama sonucunda gelen ürün listesinden ürün seçer', () => {
    
    // Arama sonucunda gelen ürün listesinden bir ürünü seçme
    
    cy.scrollTo(0,600)
    
  });

  it('Kullanici ürüne git seçeneğine tıklar', () => {
    // Ürüne git seçeneğine tıklama
    cy.wait(500)
    cy.get('[data-pr="1745758201"] > .pw_v8 > .w_v8 > .bt_v8 > b').click()  // Ürüne git linkine tıklama
    cy.wait(500)
  });

  it('Kullanici ürünü takip listesine ekler', () => {
    // Ürünü takip listesine ekleme
    
    cy.scrollTo(0,800)
    // Takip listesine ekle butonuna tıklama
    cy.get('#pf_w_v8 > .ufo_v8').click();
    
  });

  it('Kullanici takip listesini kontrol eder', () => { // Takip listesinin kontrolü
     // Bu aşamada sebebini bulamadığım şekilde logout olduğu için tekrar log-in olundu.
    cy.get('input#life').type(Cypress.config().username);  // Email alanını doldurma
    cy.get('input#lifp').type(Cypress.config().password);  // Şifre alanını doldurma
    cy.get('#lfb').click()
    
    cy.wait(600)
    
    cy.get('#H_a_v8').trigger('mouseover') // login olunduktan sonra hesabım butonuna hover edildi. (Takip Listesine tıklayabilmek için.)

    cy.get('#HM_f_v8').click({ force: true }) // Force master komutu ile Takip Listem butonuna tıklandı. (Force master olmadan Not Visible hatası alınıyordu.)
   
  

    cy.contains('iPhone').should('be.visible') //Eklenen ürünün kontrolü.
    });
   
  });

