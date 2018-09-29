<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateEquipoTable extends Migration
{
    /**
     * Schema table name to migrate
     * @var string
     */
    public $set_schema_table = 'Equipo';

    /**
     * Run the migrations.
     * @table Equipo
     *
     * @return void
     */
    public function up()
    {
        if (Schema::hasTable($this->set_schema_table)) return;
        Schema::create($this->set_schema_table, function (Blueprint $table) {
            $table->engine = 'InnoDB';
            $table->increments('equipoid');
            $table->unsignedInteger('divisionid')->nullable();
            $table->string('nombre', 100)->nullable();
            $table->string('carrera', 120)->nullable();
            $table->string('facultad', 120)->nullable();

            $table->index(["divisionid"], 'divisionid_idx');

            $table->unique(["equipoid"], 'equipoid_UNIQUE');


            $table->foreign('divisionid', 'divisionid_idx')
                ->references('divisionid')->on('Division')
                ->onDelete('no action')
                ->onUpdate('no action');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
     public function down()
     {
       Schema::dropIfExists($this->set_schema_table);
     }
}
