const checkbox1 = document.querySelector('#checkbox')

checkbox1.addEventListener('change', function(){
  const bg_body = document.body
  const bg_nav = document.querySelector('.nav')
  const bg_item = document.querySelector('.item')
  bg_body.classList.toggle('dark-bg')
  bg_nav.classList.toggle('dark-nav')
  bg_item.classList.toggle('dark-item')
})

