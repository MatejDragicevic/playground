var stringForConsole = "what ya doin";
console.log(stringForConsole);

var context = {
    title: "Title is here",
    body: "Body is here"
};

var html = Handlebars.templates.test(context);

var liferayTbody = jQuery('.liferay-table').find('tbody');
liferayTbody.append(html);

console.log(html);